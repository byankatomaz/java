package AtividadeTemoteo;

public class FormulaQuimica extends Contas{

    private Double produto;
    private Double reagente;

    public FormulaQuimica(){
        super();
    }

    public FormulaQuimica(Double a, Double b) {
        super(a, b);
    }

    public Double getProduto() {
        return produto;
    }

    public void setProduto(Double produto) {
        this.produto = produto;
    }

    public Double getReagente() {
        return reagente;
    }

    public void setReagente(Double reagente) {
        this.reagente = reagente;
    }

    @Override
    public Double formulaOne() {
        //D é densidade, m e massa da solução e V é volume da solução. D =  M / V
        //densidade
        return a/b;
    }

    public Double formulaEquiQuimi(){
        //Equilibrip quimico
        return produto/reagente;
    }



}
