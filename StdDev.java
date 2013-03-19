Methods sum, mean, median, and standard deviation in Java using Lists.
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
import java.util.*;
class methods {
    public int sum (List<Integer> a){
        if (a.size() > 0) {
            int sum = 0;
 
            for (Integer i : a) {
                sum += i;
            }
            return sum;
        }
        return 0;
    }
    public double mean (List<Integer> a){
        int sum = sum(a);
        double mean = 0;
        mean = sum / (a.size() * 1.0);
        return mean;
    }
    public double median (List<Integer> a){
        int middle = a.size()/2;
 
        if (a.size() % 2 == 1) {
            return a.get(middle);
        } else {
           return (a.get(middle-1) + a.get(middle)) / 2.0;
        }
    }
    public double sd (List<Integer> a){
        int sum = 0;
        double mean = mean(a);
 
        for (Integer i : a)
            sum += Math.pow((i - mean), 2);
        return Math.sqrt( sum / ( a.size() - 1 ) ); // sample
    }
}
class t {
    public static void main (String[]args) {
 
        methods m = new methods();
 
        List<Integer> c = Arrays.asList(2,49,11,44,88,1,1,5,33,88,5,44,2,44,44,132,6,2,22,22,5,1,22,22);
        Collections.sort(c);
 
        System.out.println(m.median(c));
        System.out.println(m.mean(c));
        System.out.println(m.sd(c));
    }
}