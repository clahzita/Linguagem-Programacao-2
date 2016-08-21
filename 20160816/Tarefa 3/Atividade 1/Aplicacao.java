class Aplicacao{
     public static void main(String[] args){
         Relogio relogio1 = new Relogio();
         relogio1.acertarRelogio(0,0,0);

         System.out.printf("%d:%d:%d\n",
                relogio1.lerHora(),relogio1.lerMinuto(),relogio1.lerSegundo());
         System.out.printf("hora -> %d\nminuto -> %d\nsegundo -> %d\n",
                relogio1.lerPosicaoHora(),relogio1.lerPosicaoMinuto(),relogio1.lerPosicaoSegundo());

        Relogio relogio2 = new Relogio(0,22,0);

         System.out.printf("%d:%d:%d\n",
                relogio2.lerHora(),relogio2.lerMinuto(),relogio2.lerSegundo());
         System.out.printf("hora -> %d\nminuto -> %d\nsegundo -> %d\n",
                relogio2.lerPosicaoHora(),relogio2.lerPosicaoMinuto(),relogio2.lerPosicaoSegundo());
     }
}