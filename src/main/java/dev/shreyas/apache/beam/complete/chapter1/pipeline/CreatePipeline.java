package dev.shreyas.apache.beam.complete.chapter1.pipeline;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;

public class CreatePipeline {
    public static void main(String[] args) {
        // Start by defining the options for the pipeline.
        PipelineOptions options = PipelineOptionsFactory.create();
        // Set options directly
        options.setJobName("Example Job");
        options.setOptionsId(1);

        // Then create the pipeline.
        Pipeline p = Pipeline.create(options);
    }
}
