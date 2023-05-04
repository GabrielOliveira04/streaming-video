# streaming-video
 Sistema de gerenciamento de um serviço de streaming de Vide
 o

######O código é um programa de streaming com algumas classes Java que simulam as funcionalidades básicas de um serviço de streaming.

######A classe principal é ServicoStreaming, que contém três listas: lista de vídeos, lista de usuários e lista de acessos. As outras classes são Video, Filme, Serie, Usuario e Acesso.



A classe Video é a classe pai que contém as informações básicas que um vídeo pode ter. A classe Filme e Serie são subclasses de Video e representam filmes e séries específicas. A classe Usuario representa um usuário do programa de streaming e contém informações como nome, email, senha e uma lista de favoritos. A classe Acesso representa um acesso de um usuário a um vídeo específico e contém informações sobre o usuário, o vídeo e a data do acesso.

A classe ServicoStreaming possui métodos para adicionar um novo vídeo à lista de vídeos, cadastrar um novo usuário, buscar um usuário por email, verificar a permissão de acesso de um usuário a um vídeo, registrar um novo acesso e buscar um vídeo por título.

O código usa a estrutura de listas do Java para armazenar os dados de vídeos, usuários e acessos e implementa algumas funcionalidades básicas de um serviço de streaming, como cadastrar novos usuários, adicionar novos vídeos, registrar acessos, buscar usuários e vídeos e verificar a permissão de acesso de um usuário a um determinado vídeo.

Em geral, o código é um bom ponto de partida para construir um serviço de streaming mais sofisticado em Java.



 
