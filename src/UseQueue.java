import java.util.Random;

public class UseQueue {
    static Random rnd = new Random();

    public static void removeNum(Queue<Integer> q, int num)
    {
        Queue<Integer> temp = new Queue<Integer>();

        while(!q.isEmpty())
        {
            if(q.head() == num)
                q.remove();
            else
                temp.insert(q.remove());
        }

        while(!temp.isEmpty())
            q.insert(temp.remove());
    }

    public static Queue<Integer> randomQueue(){
        int num = rnd.nextInt(2,21);
        int qnum;

        Queue<Integer> q = new Queue<Integer>();

        for(int i=0; i<num; i++)
        {
            qnum = rnd.nextInt(0,101);
            q.insert(qnum);
        }

        return q;
    }

    public static int queueSize(Queue<Integer> q)
    {
        Queue<Integer> result = new Queue<Integer>();
        int size = 0;

        while(!q.isEmpty())
        {
            result.insert(q.remove());
            size++;
        }

        while(!result.isEmpty())
        {
            q.insert(result.remove());
        }
        return size;
    }

    public static int maxQueue(Queue<Integer> q)
    {
        int max = q.head();
        Queue<Integer> temp = new Queue<Integer>();

        while(!q.isEmpty())
        {
            int num = q.remove();
            if(num > max)
                max = num;
            temp.insert(num);
        }

        while(!temp.isEmpty())
            q.insert(temp.remove());

        return max;
    }
    public static void main(String[] args) {
       /* Queue<Integer> qu = randomQueue();
        System.out.println(qu);

        /* size = queueSize(qu);

        System.out.println(size);


        System.out.println(maxQueue(qu));

        System.out.println(qu);*/
        Queue<Integer> q = new Queue<Integer>();
        q.insert(1);
        q.insert(1);
        q.insert(1);
        q.insert(1);

        removeNum(q, 1);
        System.out.println(q);

    }


}
