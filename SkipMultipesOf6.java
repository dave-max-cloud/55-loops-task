public class SkipMultiplesOf6{
public static void main(String[] args){

int count = 1;
while(count <= 100){
  count++;
if(count % 6 == 0){
  continue;
  }
else{
System.out.println(count);
}
}
}
}

