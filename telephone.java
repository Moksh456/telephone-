//that is ur code
// this is class telephone with two method 
class telephone1{
        void ring(){
            System.out.println("ringing......... tuze dekha to ye zana sanam.........");
        }
        void lift(){
            System.out.println("your call is lifting ");
        }
        void disconnect(){
            System.out.println("your call is desconnect ");
        }.
    }
//smart phone class extend telephone1 class
 class smartphone extends telephone1{
    void videorecording(){
        System.out.println("your video is recodring ");
    }
    void audiorecoder(){
        System.out.println("ur audio is recodring is start");
    }
}
public class telephone {

    public static void main(String[] args) {
        smartphone oppo = new smartphone() {};// in this when we use smartphone as a object then we use al features 
        oppo.ring();
        oppo.videorecording();
        telephone1 nokia = new telephone1(){};
        nokia.ring();// -->// that is not show error but when we user nokia as a video recording then telephone1 class show error because the telephoen has not allowed to user smart phone class features
      nokia.videorecording(); // --> this is also show error
      
      

    }
}
 
