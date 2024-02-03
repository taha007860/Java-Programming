public class Line {
    private Point p1;
    private Point p2;
    public Line(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    } public String computeEquation(){
        double s=((p2.getY()-p1.getY()*1.0)/(p2.getX()-p1.getX()));
        String r=s+"";
        double i=(p1.getY()-s*p1.getX());
        String g=i+"";
        String e="";
        if(s==0&&i!=0&&g.substring(g.indexOf(".")).charAt(1)=='0'&&g.substring(g.indexOf(".")).length()==2){e="y = "+(int)(i);}
        else if(s==0&&i!=0){e="y = "+(i);}
        else if(s!=0&&i==0&&r.substring(r.indexOf(".")).charAt(1)=='0'&&r.substring(r.indexOf(".")).length()==2){e="y = "+(int)(s)+"x";}
        else if(s!=0&&i==0){e="y = "+(s)+"x";}
        else if(s==1.0&&i==0){e="y = x";}
        else if(s==1.0&&i!=0&&g.substring(g.indexOf(".")).charAt(1)=='0'&&g.substring(g.indexOf(".")).length()==2){e="y = x + "+(int)(i);}
        else if(s==1.0&&i!=0){e="y = x + "+i;}
        else if(s==-1.0&&i!=0&&g.substring(g.indexOf(".")).charAt(1)=='0'&&g.substring(g.indexOf(".")).length()==2){e="y = -x + "+(int)i;}
        else if(s==-1.0&&i!=0){e="y = -x + "+i;}
        else if(s==-1.0&&i==0){e="y = -x";}
        else if(s!=0&&i!=0&&g.substring(g.indexOf(".")).charAt(1)=='0'&&r.substring(r.indexOf(".")).charAt(1)=='0'&&g.substring(g.indexOf(".")).length()==2&&r.substring(r.indexOf(".")).length()==2){e="y = "+(int)s+"x + "+(int)(i);}
        else if(i<0&&s!=0&&g.substring(g.indexOf(".")).charAt(1)=='0'&&r.substring(r.indexOf(".")).charAt(1)=='0'&&g.substring(g.indexOf(".")).length()==2&&r.substring(r.indexOf(".")).length()==2){e="y = "+(int)s+"x "+(int)(i);}
        else if(s!=0&&i!=0&&g.substring(g.indexOf(".")).charAt(1)=='0'&&g.substring(g.indexOf(".")).length()==2){e="y = "+s+"x + "+(int)(i);}
        else if(i<0&&s!=0&&g.substring(g.indexOf(".")).charAt(1)=='0'&&g.substring(g.indexOf(".")).length()==2){e="y = "+s+"x "+(int)(i);}
        else if(s!=0&&i!=0&&r.substring(r.indexOf(".")).charAt(1)=='0'&&r.substring(r.indexOf(".")).length()==2){e="y = "+(int)s+"x + "+(i);}
        else{e="y = "+s+"x + "+i;}
        return e;
    } public String toString(){
        String h="Point 1: "+p1.toString()+"\nPoint 2: "+p2.toString()+"\nEquation: "+computeEquation();
        return h;
    }
}
