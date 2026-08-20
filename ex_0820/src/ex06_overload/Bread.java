package ex06_overload;

public class Bread {
    
    //메서드 1
    public void makeBread(){
        System.out.println("빵을 만들었습니다");

    }

    //메서드 2
    public void makeBread(int cnt){
        
        for(int i = 0; i< cnt; i++){
            System.out.println("빵을 만들었습니다");
        }
        System.out.printf("요청하신 %d개의 빵을 만들었습니다\n",cnt);
    }

    //메서드 3
    public void makeBread(String name, int cnt){
        for(int i = 0; i< cnt; i++){
            System.out.println(name + "을 만들었습니다");
        }
        System.out.printf("요청하신 %d개의 %s빵을 만들었습니다",cnt,name);
    }
}
