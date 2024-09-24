public class Queue <T>{
  private Node <T> first;
  private Node <T> last;
  public Queue  (){
    first=null;
    last=null;
  }
  public boolean isEmpty(){
   return first==null;
  }
  public void insert(T x){
   Node <T> tmp=new Node <T>(x);
   if(last==null){
    last=tmp;
    first=tmp;
   }
    else{
     last.setNext(tmp);
     last=tmp;
    }}
  public T remove(){
    T x=first.getValue();
    first=first.getNext();
    if(first == null) last = null;
    return x;
   }
    public T head(){
   T x=first.getValue();
   return x;
  }
  public String toString(){
    Node <T> p=new Node <T>(first.getValue());
   p=first;
   String s="First=>";
   while(p!=null){
      s+=" ["+p.getValue()+"] =>";
       p=p.getNext();
   }
   s+= "|";
   return s;
  }
  }