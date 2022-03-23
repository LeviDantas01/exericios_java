package pCarro;

/**
 *
 * @author Levi
 */
public class Carro {
   private final double consumo;
   private double combustivel = 0;
   
   public Carro(double consumo){
       this.consumo = consumo;
       System.out.println(consumo);
   }
   
   public double andar(double kmPer){
       kmPer = this.consumo * kmPer;
       this.combustivel -= kmPer;
       return this.combustivel;
   }
   public double gasolina(){
       return this.combustivel;
   }
   public double abastecer(double abas){
       return this.combustivel += this.combustivel;
   }
}
