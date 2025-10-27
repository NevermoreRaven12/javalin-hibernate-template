🚀 Hibernate + Javalin Base Template
Template de configuração mínima para iniciar projetos Java com Javalin e Hibernate, usando MySQL como banco de dados padrão. Ideal para provas, testes rápidos ou projetos simples.

---

📦 Pré-requisitos
- Java 17+
- Maven
- MySQL Server
- IDE (IntelliJ, Eclipse, VS Code)


---

🔧 Estrutura já configurada
- pom.xml com todas as dependências (Javalin, Hibernate, MySQL, etc.)
- hibernate.cfg.xml pronto para ajustes
- HibernateUtil.java com SessionFactory configurado
- Main.java com servidor Javalin iniciado
- Pasta resources/public servindo arquivos estáticos

---

✅ Passos para finalizar a configuração
- Configurar o banco no hibernate.cfg.xml
- Edite os campos abaixo com os dados do seu banco:

```xml
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/seu_banco</property>
<property name="hibernate.connection.username">usuario</property>
<property name="hibernate.connection.password">senha</property>
```

- Mapear suas entidades
- No hibernate.cfg.xml, adicione suas classes mapeadas:

```xml
<mapping class="com.seuprojeto.models.Motorista"/>
<mapping class="com.seuprojeto.models.Veiculo"/>
<mapping class="com.seuprojeto.models.Manutencao"/>
```

- Criar as entidades
- Crie suas classes com as anotações JPA:

```java
@Entity
@Table(name = "motorista")
public class Motorista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // outros campos...
}
```

- Criar rotas no Main.java
- Exemplo de rota simples:

```java
app.get("/ping", ctx -> ctx.result("pong"));
```

- Rodar o projeto

---

📁 Estrutura de pastas sugerida
src/
├── main/
│   ├── java/
│   │   └── com/seuprojeto/
│   │       ├── Main.java
│   │       ├── HibernateUtil.java
│   │       └── models/
│   │           └── Motorista.java
│   └── resources/
│       ├── hibernate.cfg.xml
│       └── public/
│           └── index.html

---

🛠️ Dicas rápidas
- Use Session session = HibernateUtil.getSessionFactory().openSession() para interagir com o banco.
- Para servir HTML/CSS/JS, coloque os arquivos em resources/public.
- Para evitar ciclos no JSON, use @JsonIgnore nos relacionamentos bidirecionais.

---

📚 Licença
Esse template é livre para uso acadêmico e pessoal.

---
