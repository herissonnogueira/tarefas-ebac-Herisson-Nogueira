/**
 * @author herisson.nogueira
 */

package br.com.herissonnogueira.factory;

import br.com.herissonnogueira.carros.ICar;

public interface IFactory {

    ICar criarCarro();
}
