package com.springboot.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BatchConfig {

    @Bean
    public ItemReader<String> itemReader() {
        List<String> items = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4", "Item 5");
        return new ListItemReader<>(items);
    }

    @Bean
    public ItemProcessor<String, String> itemProcessor() {
        return item -> {
            System.out.println("Processing: " + item);
            return item.toUpperCase();
        };
    }

    @Bean
    public ItemWriter<String> itemWriter() {
        return items -> {
            for (String item : items) {
                System.out.println("Writing: " + item);
            }
        };
    }

    @Bean
    public Step step(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step1", jobRepository)
                .<String, String>chunk(2, transactionManager)
                .reader(itemReader())
                .processor(itemProcessor())
                .writer(itemWriter())
                .build();
    }

    @Bean
    public Job job(JobRepository jobRepository, Step step) {
        return new JobBuilder("job1", jobRepository)
                .start(step)
                .build();
    }
}

