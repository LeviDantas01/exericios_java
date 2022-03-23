package Posto;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Levi
 */
public class Abastecimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opComb;
        System.out.println("--- BEM VINDO AO POSTO PAGUE MAIS ---");
        System.out.print("Qual combustivel vai querer:\n  GC\n  GA\n  ET\n  GNV\n  S10\n  S500\n");
        opComb = sc.next();
        System.out.print("Vai pagar quanto meu patrão: ");
        Double money = sc.nextDouble();
        BombaCombustivel veiculo1 = new BombaCombustivel(opComb, money);
        
        //String pattern = "#.##";
        //DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        //String formattedDouble = decimalFormat.format(veiculo1.abastecerPorValor());
        //String pattern2 = "#.##";
        //DecimalFormat decimalFormat2 = new DecimalFormat(pattern2);
        //String formattedDouble2 = decimalFormat2.format(veiculo1.restaNaBomba());
        
        veiculo1.abastecerPorValor();
        System.out.println("Você pagou R$"+ money + "  que correspondem a "+ veiculo1.abastecerPorValor()+ "L");
        //System.out.println("Resta na bomba "+ formattedDouble2+"L");
        /**
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("--- BEM VINDO AO POSTO PAGUE MAIS ---");
        System.out.print("Qual combustivel vai querer:\n  GC\n  GA\n  ET\n  GNV\n  S10\n  S500\n");
        opComb = sc.next();
        System.out.print("Vai abastecer quantos litros meu cansagrado: ");
        Double litros = sc.nextDouble();
        BombaCombustivel veiculo2 = new BombaCombustivel(opComb, litros);
        
        String pattern1 = "#.##";
        DecimalFormat decimalFormat1 =  new DecimalFormat(pattern1);
        String formattedDouble1 = decimalFormat1.format(veiculo2.abastecerPorLitro());
        String pattern3 = "#.##";
        DecimalFormat decimalFormat3 = new DecimalFormat(pattern3);
        String formattedDouble3 = decimalFormat3.format(veiculo2.restaNaBomba());
        veiculo1.abastecerPorValor();
        System.out.println("Você abasteceu "+ veiculo2.getQuantidadeAbastecer() + "L de um jeito de pagar "+ "R$"+formattedDouble1);
        System.out.println("Resta na bomba "+ formattedDouble3+"L");
        
        System.out.println("-------------------------------------------------------------------------------------");
        String op;
        Double novoValor = 0d;
        System.out.println("Fala tu meu gerente!! Veio subir os preços ? ");
        do{
            System.out.println("Qual vai ser o combustivel:\n GC\n GA\n ET\n GNV\n S10\n S500\n");
            op = sc.next();
        }while(!"gc".equals(op) && !"ga".equals(op) && !"et".equals(op) && !"gnv".equals(op) && !"s10".equals(op) && !"s500".equals(op));
        if(null != op)switch (op) {
            case "gc" -> {
                System.out.print("Qual será o novo preco: ");
                sc.nextDouble();
            }
            case "ga" -> {
                System.out.print("Qual será o novo preco: ");
                sc.nextDouble();
            }
            case "et" -> {
                System.out.print("Qual será o novo preco: ");
                sc.nextDouble();
            }
            case "gnv" -> {
                System.out.print("Qual será o novo preco: ");
                sc.nextDouble();
            }
            case "s10" -> {
                System.out.print("Qual será o novo preco: ");
                sc.nextDouble();
            }
            case "s500" -> {
                System.out.print("Qual será o novo preco: ");
                sc.nextDouble();
            }
            default -> {
            }
        }
        
        //Apartir desse ponto minha paciencia acabou por isso ficou desse geito
        BombaCombustivel gerente = new BombaCombustivel(op, novoValor);
        gerente.alterarPreco(novoValor);
        System.out.println("Valor alterado com sucesso " + "agora o "+ op+" custa R$" + gerente.alterarPreco(novoValor));
        
        System.out.println("--------------------------------------------------------------------------------");
        
        BombaCombustivel gerente2 = new BombaCombustivel(opComb, money);
        System.out.println(gerente2.alterarQuantidadeCombustivel(100d) + gerente2.getQantidadeCombustivel());
        
        
        System.out.println("----------------------------------------------------------------------------------");
        BombaCombustivel veiculo4 = new BombaCombustivel(opComb, money);
        veiculo4.alterarCombustivel("s10");
        System.out.println("Combustivel alterado para s10");
        */ 
    }
}
