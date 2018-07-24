package com.demo.wordcount;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

   public void reduce(Text word, Iterable<IntWritable> values, Context con) throws IOException, InterruptedException
   {
      //FIXME



      //EXAMPLE of emitting key-value pair
      //con.write(word, new IntWritable(0));
   }
}
