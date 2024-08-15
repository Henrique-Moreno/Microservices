# MicroServices

<h1>Projeto de Gerenciamento de Voos</h1>

    <p>Projeto de gerenciamento de voos! Este sistema foi desenvolvido com a intenção de facilitar o controle e a gestão de voos, aplicando uma arquitetura baseada em microsserviços. Isso permite que o projeto seja escalável e de fácil manutenção, distribuindo a responsabilidade de cada funcionalidade para diferentes componentes independentes.</p>

    <h2>Tecnologias Utilizadas</h2>

    <ul>
        <li><strong>Java:</strong> Linguagem de programação principal utilizada para o desenvolvimento de todos os microsserviços.</li>
        <li><strong>Spring Framework:</strong> Framework que facilita a criação e configuração dos microsserviços, garantindo um desenvolvimento rápido e organizado.</li>
        <li><strong>PostgreSQL:</strong> Banco de dados relacional utilizado para armazenar os dados da aplicação, oferecendo robustez e confiabilidade.</li>
        <li><strong>Docker:</strong> Plataforma de contêineres utilizada para empacotar e distribuir os microsserviços, garantindo que eles sejam executados de forma consistente em qualquer ambiente.</li>
        <li><strong>Kubernetes (Kubectl e K3D):</strong> Ferramentas utilizadas para orquestração de contêineres e gerenciamento das implantações em ambientes de produção, assegurando alta disponibilidade e escalabilidade.</li>
        <li><strong>RabbitMQ:</strong> Sistema de mensagens que permite a comunicação assíncrona entre os microsserviços, promovendo uma arquitetura desacoplada e resiliente.</li>
        <li><strong>Spring Security:</strong> Framework de segurança utilizado para implementar a autenticação e autorização, garantindo que os usuários só possam acessar os recursos aos quais têm permissão. Inclui a geração e validação de tokens de autenticação para maior segurança.</li>
    </ul>

    <h2>Sobre o Projeto</h2>

    <p>A divisão do sistema em microsserviços permite que cada um seja responsável por uma parte específica da aplicação, como gerenciamento de voos, controle de passageiros, emissão de bilhetes, entre outros. Essa separação de responsabilidades é crucial para facilitar a manutenção e a escalabilidade da aplicação.</p>

    <p>Ao utilizar o Docker, garantimos que os microsserviços possam ser implantados de forma consistente em diferentes ambientes. O Kubernetes, por sua vez, cuida da orquestração, permitindo que a aplicação se adapte a demandas variadas e continue funcionando mesmo em cenários adversos.</p>

    <p>O sistema de mensagens RabbitMQ é utilizado para a comunicação entre os microsserviços, promovendo a troca de informações de forma assíncrona e eficiente, o que contribui para a robustez e flexibilidade do sistema como um todo.</p>

    <h2>Segurança</h2>

    <p>Para garantir a segurança dos dados e das operações realizadas na aplicação, o Spring Security é empregado para implementar autenticação e autorização robustas. A aplicação utiliza tokens de autenticação, que são gerados e validados a cada requisição, assegurando que apenas usuários autorizados possam acessar funcionalidades críticas.</p>

    <footer>
        <p>Desenvolvido por [Seu Nome]. Este projeto é uma implementação de um sistema de gerenciamento de voos, aplicando boas práticas de desenvolvimento e arquitetura de software.</p>
    </footer>
