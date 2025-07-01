package com.solid.lsp.badexample;

// Ejemplo INCORRECTO: El delfín hereda de Mammal y debe implementar walk(), pero no puede caminar.
// Esto rompe el LSP porque el subtipo no puede sustituir al supertipo sin alterar el comportamiento esperado.
public class Dolphin extends Mammal{
    @Override
    public void walk() {
        throw new CannotWalkException("I am a dolphin, I cannot walk!");
    }
}
