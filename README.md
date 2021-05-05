# FastBreakTruck

Este kata es un claro ejemplo del patrón de diseño BuilderPattern.

Este patrón proporciona un objeto complejo a partir de objetos simples. Toda la lógica queda encapsulado en un objeto. Es una de las mejores formas de crear un objeto.

Este kata representa una tienda de desayunos, donde, en este momento, existen solamente 2 desayunos. Uno de estos desayunos son unos cereales, Eyeholes, con su respectiva bebida, TurbulentJuice. El otro desayuno son Smiggles con FleebJuice. Existe también la opción de añadir un Plumbus en el desayuno.

Tanto los cereales, como las bebidas, como el juguete tienes que entregarse empaquetados. Los cereales y los jueguetes se empaquetarán dentro de cajas y las bebidas dentro de botellas.

Primero de todo, crearemos una interfaz donde recogeremos la información necesaria para cada item del desayuno.

Tendremos que implementar esta interfaz en cada tipo de item. Cada item tendrá unos hijos donde se concretará de que tipo de cereal o bebida se trata.

También tendremos que crear una interfaz para el empaquetado, con clases para cada tipo de empaquetado. Cada objeto del desayuno usará el tipo de empaquetado correspondiente.

Después de esto, deberemos crear una clase donde se guarden los items seleccionados y una vez seleccionados los items, tendremos la clase que se encargará de crear el desayuno.

Finalmente, tendremos el desayuno deseado, a un módico precio y con juguete incluido.
