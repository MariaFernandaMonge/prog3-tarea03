En App no se puede acceder directamente a precioBase ni a items porque son atributos private de otras clases.
El acceso a items sí compilaría dentro de Pedido, y el acceso a precioBase dentro de ItemMenu, usando las referencias correspondientes.
Esto ocurre porque una clase puede acceder a sus propios atributos privados, incluso cuando pertenecen a otra instancia de esa misma clase.
La llamada casado.getPrecioBase() sí compiló en App: protected permite el acceso desde el mismo paquete, y ambas clases están en uam.prog3.tarea03.