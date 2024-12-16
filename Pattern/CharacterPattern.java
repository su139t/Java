package Pattern;

public class CharacterPattern {
    public static void main(String[] args) {
        char alphabat = 'A';
        for(int line = 1 ; line <= 4 ; line++){
          for(int number = 1 ; number <= line ; number++){
              System.out.print(alphabat);
              alphabat++;
          }
          System.out.println(); 
        }        
      }
}
