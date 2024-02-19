package br.com.herisson;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author herisson.nogueira
 *
 */

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        // mensagens de log
        logger.debug("Mensagem de debug");
        logger.info("Mensagem de info");
        logger.warn("Mensagem de aviso");
        logger.error("Mensagem de erro");
        logger.fatal("Mensagem fatal");

        // log com exceção
        try {
            // Código que pode lançar uma exceção
            throw new RuntimeException("Exemplo de excecao");
        } catch (Exception e) {
            // Registra a exceção no log
            logger.error("Ocorreu uma excecao", e);
        }
    }
}