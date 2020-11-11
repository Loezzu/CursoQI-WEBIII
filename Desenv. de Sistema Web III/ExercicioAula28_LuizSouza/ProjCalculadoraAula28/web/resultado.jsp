
<%@page language="java"%>
<%@page import="Model.Calculadora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RESULTADO</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
          <style>
            html, body{
                transform: translateY(100%);
            }
            #resultado{
                text-align: center; 
                background-color: #343a40; 
                width: 100px; 
                color: white; 
                margin: 15px auto;
                border: 1px solid #343a40;
                border-radius: 20px;
                font-size: 20pt;
            }
            
            #botao{
                text-align: center; 
                margin-top: 15px;
            }
            
            .btn{
                padding: 20px;
            }
            
            #corpo{
                height: 100%;
            }
        </style>
    </head>
    <body>
       <section class="container">
           <h2 style="text-align: center">
           <%
               //criação de objeto para usar o que a classe tem
               Calculadora calc = new Calculadora();
               //passar os valores digitados(texto) do arquivo index.html para classe
               calc.setNumero1(request.getParameter("numero1"));
               calc.setNumero2(request.getParameter("numero2"));
               //passar a escolha da operação
               calc.setOperacao(request.getParameter("operacao"));
               //mostrar o resultado
               out.print("RESULTADO: "+calc.calcular());
           %>
           </h2>
           <div style="text-align: center">
           <a href="index.html">VOLTAR</a>
           </div>
       </section>
    </body>
</html>
 