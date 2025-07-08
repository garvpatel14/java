class Bank{
    int r;

    Bank(int rate){
        r=rate;
    }


}
class Branch extends Bank{
    int n;
    int t;
    Branch(int rate,int time,int year){
        super(rate);
        n=time;
        t=year;
        
    }

}
class Client extends Branch{
    float p;

    Client(int p,int rate,int time,int year){
        super(time,rate,year);
        this.p=p;
    }
    void calculateinterest(){
    }
}