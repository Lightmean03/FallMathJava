class XYcords<t extends Object>{
    private t x;
    private t y;
    public XYcords(t x, t y){
        this.x = x;
        this.y = y;
    }
    public XYcords(){
        this.x = null;
        this.y = null;
    }
    public XYcords(XYcords<t> xy){
        this.x = xy.getX();
        this.y = xy.getY();
    }
    public XYcords (Integer x , Integer y){
        this.x = (t)x;
        this.y = (t)y;
    }
    public t getX(){
        return x;
    }
    public t getY(){
        return y; 
    }
    public void setX(t x){
        this.x = x;
    }
    public void setY(t y){
        this.y = y; 
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    
}