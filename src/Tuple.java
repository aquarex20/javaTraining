import java.util.ArrayList;

public class Tuple<AnyType extends Comparable<AnyType>> {
    private ArrayList<AnyType> tuple= new ArrayList<>(2);
    Tuple(){
        tuple.add(null);
        tuple.add(null);
    }
    Tuple(AnyType firstValue, AnyType secondValue){
        tuple.add(0,firstValue);
        tuple.add(1,secondValue);
    }
    public void setFirst(AnyType firstValue){
        tuple.set(0,firstValue);
    }
    public void setSecond(AnyType secondValue){
        tuple.set(1,secondValue);
    }
    public AnyType first(){return tuple.get(0);}
    public AnyType second(){return tuple.get(1);}


    public boolean equals(Tuple<AnyType> obj) {
        if (obj.first()==this.first() && obj.second()==this.second())
            return true;
        return false;
    }
}
