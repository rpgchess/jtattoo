# JTattoo - Java Look and Feel Theme Library ☕

## 📌 Sobre o Projeto

Biblioteca Java para personalização de interface gráfica Swing utilizando JTattoo Look and Feel. Permite aplicar diferentes temas visuais em aplicações Java desktop.

## 🎯 Objetivo

Experimentar e demonstrar o uso da biblioteca JTattoo para customização de aparência de aplicações Java Swing, aplicando diferentes temas (skins) à interface gráfica.

## 🚀 Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **Swing** - Framework GUI Java
- **JTattoo** - Biblioteca de Look and Feel

## 📁 Estrutura do Projeto

```
jtattoo/
├── src/                    # Código-fonte Java
│   └── ...                 # Classes de demonstração
└── README.md
```

## 🎨 Look and Feel

JTattoo fornece diversos temas visuais:

- **Acryl** - Moderno e translúcido
- **Aero** - Estilo Windows Vista/7
- **Aluminium** - Metal escovado
- **Bernstein** - Tom âmbar
- **Fast** - Performance otimizada
- **Graphite** - Cinza grafite
- **HiFi** - Alto contraste
- **McWin** - Estilo MacOS
- **Mint** - Verde menta
- **Noire** - Tema escuro
- **Smart** - Limpo e simples
- **Texture** - Com texturas

## 💻 Como Usar

### Pré-requisitos

- **JDK 8+**
- **JTattoo JAR** (incluído ou via Maven/Gradle)

### Aplicar Look and Feel

```java
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Definir o Look and Feel
            UIManager.setLookAndFeel(new AcrylLookAndFeel());
            
            // Criar sua aplicação Swing
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("JTattoo Demo");
                // ...
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## 🔧 Compilação e Execução

### Opção 1: Com Maven

```bash
# Build
mvn clean compile

# Executar
mvn exec:java -Dexec.mainClass="Main"
```

### Opção 2: Com Gradle

```bash
# Build
gradle build

# Executar
gradle run
```

### Opção 3: Linha de Comando

```bash
# Compilar
javac -cp .:jtattoo.jar src/**/*.java

# Executar
java -cp .:jtattoo.jar:src Main
```

## 📦 Dependências

**Maven:**

```xml
<dependency>
    <groupId>com.jtattoo</groupId>
    <artifactId>JTattoo</artifactId>
    <version>1.6.13</version>
</dependency>
```

**Gradle:**

```gradle
implementation 'com.jtattoo:JTattoo:1.6.13'
```

## 🎨 Exemplos de Temas

### Aplicar Diferentes Temas

```java
// Acryl (Translúcido moderno)
UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

// Aero (Windows Vista/7)
UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");

// Noire (Dark theme)
UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");

// McWin (MacOS style)
UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

// Graphite (Cinza grafite)
UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
```

### Customização de Cores

```java
Properties props = new Properties();
props.put("logoString", "Minha Aplicação");
props.put("backgroundPattern", "true");
props.put("focusCellColor", "255 255 0");

AcrylLookAndFeel.setCurrentTheme(props);
UIManager.setLookAndFeel(new AcrylLookAndFeel());
```

## 💡 Conceitos Demonstrados

- Look and Feel API do Java Swing
- Customização de UI em runtime
- Properties e configuração de temas
- Integração de bibliotecas de terceiros
- UIManager e configuração global

## ⚙️ Melhorias Implementadas

### ✅ Configuração
- **EditorConfig** adicionado para encoding UTF-8
- Indentação Java configurada (tabs, 4 espaços)

### ✅ Documentação
- README expandido com exemplos de código
- Múltiplas opções de build documentadas
- Exemplos de todos os temas principais
- Customização de cores explicada
- Dependências Maven/Gradle atualizadas

## 🔗 Links Úteis

- [JTattoo Official Site](http://www.jtattoo.net/)
- [JTattoo GitHub](https://github.com/JTattoo/JTattoo)
- [Java Look and Feel Guide](https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/)
- [Swing UIManager](https://docs.oracle.com/javase/8/docs/api/javax/swing/UIManager.html)

## 👨‍💻 Autor

Claudio Almeida

## 📝 Licença

Projeto de estudo/demonstração.

