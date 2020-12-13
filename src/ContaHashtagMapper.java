import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class ContaHashtagMapper extends Mapper<Object, Text, Text, IntWritable>{

    private final static IntWritable numeroUm = new IntWritable(1);
    private final Text palavra = new Text();

}
