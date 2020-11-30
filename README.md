## *Padrão de Projetos* <br />
### **Pattern Name and Classification** <br />
*Padrão Factory Method* <br />
  •	Padrão Criacional <br />

### **Intent e Motivation** <br />
  •	1. Define uma interface para criação de objetos. <br />
  •	2. As subclasses são responsaveis pela inicialização e utilização da interface<br />
  •	3. Centralização das dependências em um unico ponto. <br />

### **Applicability** <br />
  •	Essencial quando o projeto tem uma estrutura de classes complexas com varias dependências entre si.

### **Structure** <br />
<img align="left" width="400" height="200" src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Factory_Method_UML_class_diagram.png/400px-Factory_Method_UML_class_diagram.png"> <br />

<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
### **Participants** <br />
  • O padrão Factory Method possui 4 participantes<br />
  • Cliente: É quem tem a dependência com iProduct.<br />
  • Creator: Responsável pela construção e definição do Factory Method<br />
  • IProduct: Define a interface de objetos que o Factory cria.<br />
  • ProductA, ProductB,C: Implementa a interface do Product.<br />
  

### **Sample**
•	[Codigo feito](https://github.com/DavidLucasK/PadraoDeProjeto/tree/master/FactoryMethod)<br />

