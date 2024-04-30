import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeCarros {
    List<Carro> carroList = new ArrayList<>();


    public Boolean adicionarCarro(Carro novoCarro){
        for(Carro Carros : carroList){
            if (Carros.getPlaca().equals(novoCarro)){
                return false;
            }
        }
        carroList.add(novoCarro);
        return true;
    }
    public List<Carro> obterTodosCarros(){
        return carroList;
    }
    public Carro obterCarroPorPlaca(String placa){
        for(Carro carro : carroList){
            if (carro.getPlaca().equals(placa)){
                return carro;
            }
        }
        return null;
    }
    public void atualizarCarro(String placa,String modelo, String cor){
        Carro carros = obterCarroPorPlaca(placa);
        if (carros != null){
            carros.setModelo(modelo);
            carros.setCor(cor);
        }
    }
    public void atualizarCarroModelo(String placa,String modelo){
        Carro carros = obterCarroPorPlaca(placa);
        if (carros != null){
            carros.setModelo(modelo);
        }
    }
    public void atualizarCarroCor(String placa, String cor){
        Carro carros = obterCarroPorPlaca(placa);
        if (carros != null){
            carros.setCor(cor);
        }
    }

    public void removerCarro(String placa){
        carroList.removeIf(carro -> carro.getPlaca().equals(placa));
    }

}
