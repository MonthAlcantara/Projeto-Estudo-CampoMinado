package io.github.monthalcantara;

import io.github.monthalcantara.cm.modelo.Campo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CampoTest {
    private Campo campo;

    @BeforeEach
    void iniciarCampo(){
        campo = new Campo(3,3);
    }

    @Test
    @DisplayName("Deve adicionar vizinho com distancia 1")
    void testeVizinhoRealDistancia1(){
        Campo vizinhoEsquerda = new Campo(3,2);
        Campo vizinhoDireita = new Campo(3,4);
        Campo vizinhoSuperior = new Campo(2,3);
        Campo vizinhoInferior = new Campo(4,3);

        boolean isVizinhoEsquerda = campo.adicionarVizinho(vizinhoEsquerda);
        boolean isVizinhoDireita = campo.adicionarVizinho(vizinhoDireita);
        boolean isVizinhoSuperior = campo.adicionarVizinho(vizinhoSuperior);
        boolean isVizinhoInferior = campo.adicionarVizinho(vizinhoInferior);

        Assertions.assertTrue(isVizinhoEsquerda);
        Assertions.assertTrue(isVizinhoDireita);
        Assertions.assertTrue(isVizinhoSuperior);
        Assertions.assertTrue(isVizinhoInferior);
    }

    @Test
    @DisplayName("Deve adicionar vizinho com distancia 2")
    void testeVizinhoDistanciaDiagonal(){
        Campo vizinho= new Campo(2,2);
        boolean isVizinho = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(isVizinho);
    }
    @Test
    @DisplayName("Não deve adicionar vizinho com distancia 2")
    void testeNaoVizinho(){
        Campo vizinho= new Campo(1,1);
        boolean isVizinho = campo.adicionarVizinho(vizinho);
        Assertions.assertFalse(isVizinho);
    }

}
