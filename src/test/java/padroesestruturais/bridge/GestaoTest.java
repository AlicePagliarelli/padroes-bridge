package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordenadorTest {

    @Test
    void deveRetornarSalarioCoordenadorComEnsinoMedio() {
        Escolaridade escolaridade = new EnsinoMedio();
        Gestao gestao = new Gestao(2000.0f);
        gestao.setEscolaridade(escolaridade);
        assertEquals(2000.0f, gestao.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Gestao gestao = new Gestao(2000.0f);
        gestao.setEscolaridade(escolaridade);
        assertEquals(2200.0f, gestao.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Gestao gestao = new Gestao(2000.0f);
        gestao.setEscolaridade(escolaridade);
        assertEquals(2400.0f, gestao.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Gestao gestao = new Gestao(2000.0f);
        gestao.setEscolaridade(escolaridade);
        assertEquals(2600.0f, gestao.calcularSalario(), 0.01f);
    }

}