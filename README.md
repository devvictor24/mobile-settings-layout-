Settings Screen - Jetpack Compose
Uma tela de configurações moderna e interativa desenvolvida com Jetpack Compose para Android, demonstrando os fundamentos de construção de interfaces declarativas, organização de layout e gerenciamento de estado em aplicações Android modernas.

Funcionalidades
✅ Cabeçalho personalizado com nome do aplicativo e ícone de configurações
🖼️ Imagem de perfil clicável
☑️ Checkbox para aceitar cookies não essenciais
🔄 Switch para permitir download usando dados móveis
📏 Slider para configurar o tamanho do texto
⚪ RadioButtons para selecionar forma de pagamento preferida
🚪 Botão Sign Out com AlertDialog de confirmação
🛠️ Tecnologias Utilizadas
Linguagem: Kotlin
UI Toolkit: Jetpack Compose
IDE: Android Studio
Arquitetura: UI Declarativa
Componentes: Material 3

Componentes Implementados
1. SettingsHeader
Cabeçalho centralizado com o nome do aplicativo e ícone de configurações, utilizando TextStyle personalizado.
2. SettingsImage
Exibição da imagem de perfil do usuário com funcionalidade de clique para futura alteração.
3. SettingsCheckbox
Controle de estado booleano para aceitar/recusar cookies não essenciais.
4. SettingsSwitch
Toggle switch para habilitar/desabilitar download via dados móveis.
5. SettingsSlider
Slider interativo para ajuste do tamanho do texto (valor Float).
6. SettingsRadioButtons
Grupo de RadioButtons para seleção única do método de pagamento (PayPal, Credit Card, Bank Transfer).
7. SettingsAlertDialog
Diálogo de confirmação para ação de Sign Out.

💡 Conceitos Aplicados
✅ UI Declarativa com Jetpack Compose
✅ Scaffold para estruturação da tela principal
✅ Column e Row para organização de layout
✅ Modifier para estilização e comportamento
✅ remember { mutableStateOf(...) } para gerenciamento de estado reativo
✅ @Preview para visualização em tempo de desenvolvimento
✅ strings.xml para internacionalização e manutenção
✅ TextStyle personalizado para consistência visual
✅ Funções @Composable separadas para reutilização e organização


📸 Screenshots

<img width="1875" height="682" alt="image" src="https://github.com/user-attachments/assets/4472466a-b6df-4b03-a984-fcebb02e154c" />

