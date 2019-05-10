package com.oop;


import com.oop.entidades.Cliente;
import com.oop.entidades.Produto;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestandoHerancaProdutoModeloAbstrato {

    @Test
    public void testantoSeHerdouId(){
        Produto p1 = new Produto();

        String id = p1.getId();

        Assert.assertEquals(p1.getId(),id);
     }




}
