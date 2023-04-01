package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarSalarioProfessorComEnsinoMedio() {
        Escolaridade escolaridade = new EnsinoMedio();
        ProfGastronomia profGastronomia = new ProfGastronomia(50.0f);
        profGastronomia.setEscolaridade(escolaridade);
        profGastronomia.setNumRefeicao(2);
        assertEquals(100.0f, profGastronomia.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        ProfGastronomia professor = new ProfGastronomia(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumRefeicao(2);
        assertEquals(110.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        ProfGastronomia profGastronomia = new ProfGastronomia(50.0f);
        profGastronomia.setEscolaridade(escolaridade);
        profGastronomia.setNumRefeicao(2);
        assertEquals(120.0f, profGastronomia.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        ProfGastronomia profGastronomia = new ProfGastronomia(50.0f);
        profGastronomia.setEscolaridade(escolaridade);
        profGastronomia.setNumRefeicao(2);
        assertEquals(130.0f, profGastronomia.calcularSalario(), 0.01f);
    }

}