-- =======================================
-- SCRIPT: script-infra-grupo.sh
-- Descrição: Cria o grupo de recursos
-- =======================================

az group create --name rg-fenix --location eastus2

-- =======================================
-- SCRIPT: script-infra-sql.sh
-- Descrição: Cria servidor e banco de dados Azure SQL
-- =======================================

az sql server create   --name fenix-sever   --resource-group rg-fenix   --location eastus2   --admin-user user-fenix   --admin-password SenhaForte123!

az sql db create   --resource-group rg-fenix   --server fenix-sever   --name bd-fenix   --edition GeneralPurpose   --compute-model Serverless   --family Gen5   --capacity 1

az sql server firewall-rule create   --resource-group rg-fenix   --server fenix-sever   --name AllowAzureServices   --start-ip-address 0.0.0.0   --end-ip-address 0.0.0.0

-- =======================================
-- SCRIPT: script-infra-acr.sh
-- Descrição: Cria Azure Container Registry
-- =======================================

az acr create   --resource-group rg-fenix   --name acrfiapmr552513   --sku Standard   --location eastus2

-- =======================================
-- SCRIPT: script-infra-app.sh (PaaS)
-- Descrição: Cria App Service (Java)
-- =======================================

az appservice plan create   --name plan-fenix   --resource-group rg-fenix   --sku B1   --is-linux

az webapp create   --resource-group rg-fenix   --plan plan-fenix   --name app-fenix   --runtime "JAVA:17-java17"

-- =======================================
-- SCRIPT: script-infra-app.sh (Container)
-- Descrição: Cria Web App for Containers (imagem do ACR)
-- =======================================

az appservice plan create   --name plan-fenix   --resource-group rg-fenix   --sku B1   --is-linux

az webapp create   --resource-group rg-fenix   --plan plan-fenix   --name app-fenix   --deployment-container-image-name acrfiapmr552513.azurecr.io/fenix-app:latest
