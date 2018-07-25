package com.demo.wordcount;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    public void map(LongWritable key, Text value, Context con) throws IOException, InterruptedException
    {
        if( value != null ) {
            String line = value.toString();
            //FIXME



            //EXAMPLE of emitting key-value pair
            //Text outputKey = new Text("some string");
            //IntWritable outputValue = new IntWritable(1);
            //con.write(outputKey, outputValue);
        }
    }
}
