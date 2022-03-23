package Posto;
/**
 *
 * @author Levi
 */
public final class BombaCombustivel {
    private String tipoCombustivel;
    private Double valorLitro;
    private Double quntidadeCombustivel = 1000d;
    private Double quntidadeAbastecer;
    
    public BombaCombustivel(String tipoCom, Double abastecimento, boolean trocarComb){
        this.setTipoCombustivel(tipoCom);
        this.setQuantidadeAbastecer(abastecimento);
        switch(this.getTipoCombustivel()){
            case "gc" -> {
                this.setValorLitro(7.84);
            }
            case "ga" ->{
                this.setValorLitro(8.45);
            }
            case "et" ->{
                this.setValorLitro(5.98);
            }
            case "gnv" ->{
                this.setValorLitro(6.17);
            }
            case "s10"->{
                this.setValorLitro(5.98);
            }
            case "s500"->{
                this.setValorLitro(5.10);
            }
            default -> {
                System.out.println("Produto invalido");
            }
        }
    }
    
    public String getTipoCombustivel(){
        return this.tipoCombustivel;
    }
    public void setTipoCombustivel(String tipo){
        this.tipoCombustivel = tipo;
    }
    public Double getValorLitro(){
        return this.valorLitro;
    }
    public void setValorLitro(double valor){
        this.valorLitro = valor;
    }
    public Double getQantidadeCombustivel(){
        return this.quntidadeCombustivel;
    }
    public void setQuantidadeCombustivel(double novaQntidade){
        this.quntidadeCombustivel = novaQntidade;
    }
    public Double getQuantidadeAbastecer(){
        return this.quntidadeAbastecer;
    }
    public void setQuantidadeAbastecer(double novoAbastecimento){
        this.quntidadeAbastecer = novoAbastecimento;
    }
    public Double abastecerPorValor(){
        return this.getQuantidadeAbastecer() / this.getValorLitro();
    }
    public Double restaNaBomba(){
        return this.quntidadeCombustivel - abastecerPorValor();
    }
    public Double abastecerPorLitro(){
        return this.getValorLitro() * this.getQuantidadeAbastecer();
    }
    public BombaCombustivel(String escolhaTipoCombus ,Double alterarPreco){
        this.setTipoCombustivel(escolhaTipoCombus);
        this.setQuantidadeAbastecer(alterarPreco);
        switch(this.getTipoCombustivel()){
            case "gc" -> {
                this.setValorLitro(alterarPreco);
            }
            case "ga" ->{
                this.setValorLitro(alterarPreco);
            }
            case "et" ->{
                this.setValorLitro(alterarPreco);
            }
            case "gnv" ->{
                this.setValorLitro(alterarPreco);
            }
            case "s10"->{
                this.setValorLitro(alterarPreco);
            }
            case "s500"->{
                this.setValorLitro(alterarPreco);
            }
            default -> {
                System.out.println("Produto invalido");
            }
        }
    }
    public Double alterarPreco(Double novoPreco){
        return this.valorLitro;
    }
    public String alterarCombustivel(String novoComb){
        return this.tipoCombustivel;
    }
    public Double alterarQuantidadeCombustivel(Double colocaBomba){
        return this.quntidadeCombustivel;
    }
}
