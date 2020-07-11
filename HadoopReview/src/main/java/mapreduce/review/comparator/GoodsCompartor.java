package mapreduce.review.comparator;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

/**
 * @author Yu HaiFeng
 * @Description
 * @create 2020-05-03 21:36
 */
public class GoodsCompartor extends WritableComparator {

    public GoodsCompartor(){
        super(GoodsBean.class,true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        GoodsBean a1 = (GoodsBean) a;
        GoodsBean b1 = (GoodsBean) b;
        return a1.getId().compareTo(b1.getId());
    }
}
