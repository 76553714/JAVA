package lab3q2;

 public class Essay extends GradeActivity
 {
   int grammar;//30
   int spelling;//20
   int length;//20
   int content;//30
   
   public Essay() {}
   public Essay(int gra,int spe,int len,int con) {this.grammar=gra;this.spelling=spe;this.length=len;this.content=con;}
   void setScore(int score) {this.score=score ;}
   int  getScore(         ) {this.score=this.grammar+this.spelling+this.length+this.content;return this.score;}
 
    
 }
   
