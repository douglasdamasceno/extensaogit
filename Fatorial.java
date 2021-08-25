public class Fatorial {
   public long fatorialDoNumero(int num) {
       int anterior = num-1;
       long fatorialDesteNumero = 0;

       if (num <= 1) return 1;
       else fatorialDesteNumero =  num * fatorialDoNumero(anterior);
       return fatorialDesteNumero;
   }

}
