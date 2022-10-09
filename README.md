# ProjetoWebServices - Fiap Notes

<!---Esses são exemplos. Veja https://shields.io para outras pessoas ou para personalizar este conjunto de escudos. Você pode querer incluir dependências, status do projeto e informações de licença aqui--->

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:
<!---Estes são apenas requisitos de exemplo. Adicionar, duplicar ou remover conforme necessário--->
* Você instalou a versão mais recente para back-end de `<Java / Spring-boot / H2 / Swagger2>`
* Você instalou a versão mais recente para front-end de `<Axios / React / React-router-dom / Vite / Typescript>`
* Você tem uma máquina `<Windows / Mac>`.

## 🚀 Instalando ProjetoWebServices - Fiap Notes

Para instalar o ProjetoWebServices - Fiap Notes, siga estas etapas:

#Front-end:

Após subir um o projeto para uma IDE de sua escolha, execute o comando `npm run dev`, para rodar o projeto em ambiente de desenvolvimento.

```
npm run dev
```

Acesse o caminho `http://localhost:3001/`. A aplicação vai carregar automaticamente.

#Back-end:

Após subir um o projeto para uma IDE de sua escolha, rode o projeto pela classe principal `App.java`

Após isso o back-end da aplicação vai estar executando no caminho `http://localhost:8080/`

Também é possivel acessar o banco de dados da aplicação pelo caminho `http://localhost:8080/h2-console/`

## ☕ Usando ProjetoWebServices - Fiap Notes

Para criar uma nova nota é realmente simples, clica no botão "+", escreva um novo nome e marque se o card é imporant ou não. Após isso seu card sera salvo no banco de dados.

Para excluir uma nota voce deve clica no botão de "lixeira". Isso vai remover a sua nota da tela e do banco de dados.

Para editar uma nota, apenas clique no botão de "lapis", um modal vai abrir permitindo voce a mudar o nome e se o card é important, após isso apenas clique em salvar.

Para filtrar apenas pelos cards imporantes, clique no botão de "!". Apenas os cards que são importantes vão aparecer.

Para filtrar por nome, escreva o nome do card que voce quer filtrar. Apenas os cards com esse nome vão aparecer na lista. 

Para usar ProjetoWebServices - Fiap Notes, apenas as requests:

```
Para poder consumir todas as requisições criadas nos projetos basta acessar o caminho do Swagger, 
após o projeto estar rodando. <localhost:8080/swagger-ui.html>
```

## 📫 Contribuindo para ProjetoWebServices - Fiap Notes
<!---Se o seu README for longo ou se você tiver algum processo ou etapas específicas que deseja que os contribuidores sigam, considere a criação de um arquivo CONTRIBUTING.md separado--->
Para contribuir com ProjetoWebServices - Fiap Notes>, siga estas etapas:

1. Bifurque este repositório.
2. Crie um branch: `git checkout -b main`.
3. Faça suas alterações e confirme-as: `git commit -m '<mensagem_commit>'`
4. Envie para o branch original: `git push origin main`
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/33105000?v=4" width="100px;" alt="Foto do Guilherme Melo"/><br>
        <sub>
          <b>Guilherme Melo</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/67209629?v=4" width="100px;" alt="Foto da Patricia Tami"/><br>
        <sub>
          <b>Patricia Tami</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/39777075?v=4" width="100px;" alt="Foto do Wellington Brito"/><br>
        <sub>
          <b>Wellington Brito</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/25730747?v=4" width="100px;" alt="Foto do Gabriel Tadachi"/><br>
        <sub>
          <b>Gabriel Tadachi</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/7660575?v=4" width="100px;" alt="Foto do Gustaco Ceccon"/><br>
        <sub>
          <b>Gustavo Ceccon</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

