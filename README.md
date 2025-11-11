## 🕊️ **FÊNIX – WORK SOUL (DEVOPS EDITION)**

### 📘 **Índice**

1. [Integrantes](#integrantes)
2. [Vídeo do Funcionamento do Projeto](#vídeo-do-funcionamento-do-projeto)
3. [Arquitetura da Solução & Pipeline DevOps](#arquitetura-da-solução--pipeline-devops)
4. [Descrição do Projeto](#descrição-do-projeto)
5. [Objetivo](#objetivo)
6. [Conexão com os ODS da ONU](#conexão-com-os-ods-da-onu)
7. [Tecnologias Utilizadas](#tecnologias-utilizadas)
8. [Setup & Deploy](#setup--deploy)
9. [Infraestrutura como Código (IaC) & Scripts](#infraestrutura-como-código-iac--scripts)
10. [Benefícios Alcançados para o Negócio](#benefícios-alcancados-para-o-negócio)
11. [Como Contribuir](#como-contribuir)
12. [Licença](#licença)

---

### 👩‍💻 Integrantes

* Calina Thalya - RM552523 (2TDSPW)
* Ana Paula - RM552513 (2TDSR)

---

### 🎥 **Vídeo do Funcionamento do Projeto**

*(Aqui vai o vídeo explicando todo o fluxo da aplicação)*
`![Vídeo Demo](link-do-video-aqui)`

---

### 🧩 **Arquitetura da Solução & Pipeline DevOps**

*(Aqui vai a imagem da arquitetura geral do sistema com backend, banco e frontend)*
`![Arquitetura do Sistema](link-da-imagem-aqui)`

**Pipeline CI/CD** *(fingindo que tem o diagrama)*
`![Pipeline DevOps](link-da-imagem-pipeline-aqui)`

* **Branches:** main, dev, feature/*
* **Build:** Maven/Gradle no Azure DevOps
* **Testes automatizados:** unitários e integração
* **Deploy automático:** Azure Web App
* **Monitoramento:** Logs centralizados e alertas configurados

---

### 💡 **Descrição do Projeto**

O **Fênix – Work Soul** é uma plataforma web desenvolvida para promover o **bem-estar emocional no ambiente de trabalho**, aliando tecnologia, empatia e propósito.
A aplicação permite que colaboradores registrem seu **humor diário** durante o expediente, criando um histórico emocional que pode ser analisado ao longo do tempo.
Com base nesses registros, o sistema gera **insights sobre o clima organizacional** e oferece recomendações voltadas ao equilíbrio entre produtividade e saúde mental.

O **Sistema Fênix – Work Soul**, que realiza o **Registro de Humor de Funcionários**, foi criado para que cada colaborador possa registrar diariamente como está se sentindo.
Esses registros são salvos em um banco de dados e, posteriormente, analisados por uma **Inteligência Artificial** que realiza uma **análise de sentimentos** sobre os dados coletados.
Com base nessas análises, o **time de RH** e os **psicólogos da empresa** poderão identificar **padrões emocionais**, **momentos de maior estresse** e **oportunidades de melhoria**.
Assim, será possível **estabelecer pausas estratégicas**, **propor dinâmicas e ações voltadas ao bem-estar** e **fortalecer a saúde mental de todos os colaboradores**. 💖

No futuro, o sistema será expandido com integração a **profissionais de psicologia e IA generativa**, criando uma rede de apoio digital que unirá cuidado humano e tecnologia no mesmo ecossistema.

---

### 🎯 **Objetivo**

O objetivo do **Fênix – Work Soul** é **redefinir o futuro do trabalho** ao colocar o **bem-estar emocional** no centro das relações profissionais.
A plataforma busca oferecer às empresas e aos colaboradores uma forma **simples, tecnológica e empática** de **monitorar e compreender os estados emocionais**, promovendo um ambiente de trabalho mais humano, equilibrado e sustentável.

Mais do que uma ferramenta digital, o projeto é uma **iniciativa de transformação cultural**, que incentiva a escuta ativa, o autocuidado e o diálogo aberto sobre saúde mental — temas ainda considerados tabu em muitas organizações.
Ao identificar **padrões emocionais coletivos** e **momentos críticos de estresse**, o sistema permite que o **RH e as lideranças** tomem decisões mais conscientes, implementando políticas e ações que impactem positivamente a produtividade e a qualidade de vida no ambiente corporativo.

Além disso, o **Fênix – Work Soul** representa o alinhamento entre **inovação tecnológica e responsabilidade social**, demonstrando que o uso de tecnologias emergentes, como IA e DevOps, pode gerar **benefícios concretos para pessoas e organizações** de forma ética e sustentável.

---

### 🌍 **Conexão com os ODS da ONU**

**ODS 3 – Saúde e Bem-Estar:** prevenção de estresse e burnout, pausas estratégicas e autocuidado.

**ODS 8 – Trabalho Decente e Crescimento Econômico:** ambiente saudável e produtivo, retenção de talentos.

**ODS 9 – Indústria, Inovação e Infraestrutura:** automação, DevOps e IA para escalabilidade.

**ODS 10 – Redução das Desigualdades:** inclusão emocional e digital para todos os colaboradores.

---

### ⚙️ **Tecnologias Utilizadas**

* **Java 17 / Spring Boot** – backend MVC com JPA, Spring Security e Thymeleaf
* **Azure DevOps** – repositório, CI/CD, automação de builds e releases
* **Azure CLI** – scripts para criação de recursos de nuvem
* **Banco de Dados Azure SQL** – registros de humor e análises da IA
* **Maven / Gradle** – gerenciamento de dependências e build
* *(Futuro)* **IA Generativa (Spring AI)** – análise de sentimentos
* *(Futuro)* **Integração com Psicólogos/Terapeutas**

---

### 🖥️ **Setup & Deploy**

**Clone do projeto:**

```bash
git clone https://github.com/CalinaThalya/Fenix-Work-Soul.git
cd Fenix-Work-Soul
```

**Configuração de ambiente:**

* Variáveis de ambiente do Azure (DB_USER, DB_PASS, etc)
* Java 17 instalado

**Build & Run local:**

```bash
mvn clean install
mvn spring-boot:run
```

**Deploy automático via Azure DevOps:**

* Pipeline detecta alterações na branch `main`
* Build + testes executados automaticamente
* Deploy no Azure Web App

**Monitoramento:**

* Logs centralizados no Azure Monitor
* Alertas via email/Teams para falhas críticas

---

### 🛠️ **Infraestrutura como Código (IaC) & Scripts**

Todos os scripts de provisionamento e configuração do projeto estão localizados na pasta `/scripts`. Eles seguem a nomenclatura exigida de DevOps:

* `script-infra-rg.sh` – cria o Resource Group no Azure
* `script-infra-vnet.sh` – cria a rede virtual
* `script-infra-appservice.sh` – cria o Azure Web App
* `script-bd.sql` – cria o banco de dados e as tabelas necessárias

**Proteção de Dados Sensíveis**
As credenciais sensíveis, como `DB_USER` e `DB_PASS`, **não estão presentes no código-fonte**. Elas são gerenciadas via **Azure Key Vault** e utilizadas como variáveis de ambiente no Pipeline do Azure DevOps. Isso garante que dados críticos permaneçam seguros e em conformidade com o requisito 16 do DevOps Lab.

**Como usar os scripts:**

```bash
# Executar scripts de infraestrutura
cd scripts
bash script-infra-rg.sh
bash script-infra-vnet.sh
bash script-infra-appservice.sh

# Criar banco de dados
sqlcmd -S <server> -U $DB_USER -P $DB_PASS -i script-bd.sql
```

---

### 🌱 **Benefícios Alcançados para o Negócio**

* **Clima organizacional melhor:** intervenções preventivas
* **Decisões baseadas em dados reais**
* **Cultura de cuidado e empatia**
* **Produtividade sustentável**
* **Escalabilidade & inovação contínua**
* **Responsabilidade social corporativa**

---

### 🤝 **Como Contribuir**

1. Crie uma branch `feature/nome-da-feature`
2. Faça alterações locais e commit:

```bash
git commit -m "Descrição do que você fez"
```

3. Push para o repositório e abra Pull Request
4. Pipeline rodará testes e build automaticamente

---

### 📄 **Licença**

MIT License – Projeto acadêmico / DevOps Lab

---
