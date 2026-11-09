# Maplife

API REST para **mapear hábitos**: cadastrar, remover e registrar a última vez que cada hábito foi feito.

> [!NOTE]
> Projeto **exclusivamente de estudo** (Java e Spring Boot). Não é destinado a produção. Não há front-end, apenas a API.

## Regra do projeto

> [!WARNING]
> Todo o código é escrito à mão pelo autor. **Nenhum código gerado por IA.** A IA só ensina e revisa.

## Objetivos de aprendizado

- Java 21 e Spring Boot
- Arquitetura **MVC** em camadas (Controller → Service → Repository)
- Princípios **SOLID** aplicados em código real
- Persistência com JPA/Hibernate e MySQL
- Testes automatizados (JUnit e Mockito)

## Stack

| Item | Tecnologia |
| :--- | :--- |
| Linguagem | Java 21 |
| Framework | Spring Boot 4.1.2 (WebMVC, Data JPA, Validation) |
| Banco de dados | MySQL |
| Build | Maven (`mvnw`) |
| Testes | JUnit, Mockito, `@WebMvcTest` |

## Domínio

Duas entidades:

- **Habito**: nome, descrição, data de criação.
- **Registro**: hábito, data/hora em que foi feito.

A "última vez que fez" **não é um campo**: é calculada a partir do registro mais recente do hábito.

## Funcionalidades (MVP)

- [ ] Criar, listar, buscar, editar e remover hábito
- [ ] Registrar que o hábito foi feito (com data opcional)
- [ ] Consultar a última vez que o hábito foi feito
- [ ] Listar o histórico de registros de um hábito

## Arquitetura

```
Controller  →  Service  →  Repository  →  MySQL
   (DTOs)      (regras)     (JPA)
        ↘      Mapper      ↙
     DTO ⇄ Entidade (Model)
```

- DTOs de entrada e saída (records) separados das entidades JPA (model).
- **Mapper** dedicado converte DTO ⇄ Entidade, para o Controller não expor a entidade e o Service não conhecer detalhes de formato da API.
- O **Controller** chama o Mapper: converte DTO → Entidade ao receber e Entidade → DTO ao responder. Service e Repository só trabalham com entidades.
- Tratamento de erros centralizado com `@RestControllerAdvice`.

## SOLID no Maplife

Diário de aprendizado. Começa como lista de objetivos e ganha exemplos reais conforme o código cresce.

| Princípio | Objetivo | Onde foi aplicado |
| :--- | :--- | :--- |
| S: Responsabilidade única | Cada classe com um motivo para mudar | _a preencher_ |
| O: Aberto/fechado | Estender sem alterar código existente | _a preencher_ |
| L: Substituição de Liskov | Subtipos substituíveis | _a preencher_ |
| I: Segregação de interfaces | Interfaces pequenas e coesas | _a preencher_ |
| D: Inversão de dependência | Service depende de abstrações | _a preencher_ |

## Como rodar

Requisitos: JDK 21 e um MySQL em execução (a confirmar o modo: Docker ou local).

```bash
cd api
./mvnw spring-boot:run
```

> [!WARNING]
> A configuração do banco (`application.properties`) ainda não existe. Credenciais nunca devem ser versionadas.

## Roadmap

**Fase 2**
- Streaks (dias seguidos)
- Frequência-alvo (ex.: 3x por semana)
- Documentação com Swagger/OpenAPI (springdoc)

**Ideia futura**
- Integração com IA (Spring AI). Fora do escopo atual.

**Fora do escopo**
- Usuários e autenticação
- Front-end
