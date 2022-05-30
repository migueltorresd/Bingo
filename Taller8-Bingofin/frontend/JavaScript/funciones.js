/**
 * se crea funcion carga para enviar formulario con los datos del usuario 
 * para la base de datos en mongo
 */

function carga(e) {
    e.preventDefault();
  
    const datos = {
      name: document.getElementById("nombre").value,
      email: document.getElementById("correo").value,
      usuario: document.getElementById("usuario").value,
      password: document.getElementById("password").value,
    };
  
    fetch(
     // "http://localhost:3000/api/v1/contacts/new/contact",
      "http://localhost:3000/user",
      {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(datos),
      }
    )
      .then((res) => res.json())
      .then((datos) => {
        console.log(datos)
      });
  }