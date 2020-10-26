# Padrão Template Methods

* Pattern Name and Classification
  - Name: Template Methods
  - Classification: Comportamental


* Intent
  - Facilitar a customização do algoritmo sem precisar alterar a estrutura do programa.

* Motivation
  - O Template Method permite criarmos uma super classe com métodos abstratos onde as subclasses substituem esse método para um comportamento específico daquela classe.

* Applicability
  - O Template Method deve ser utilizado em aplicações que possuem estrutura hierárquica e um algoritmo que pode ser divido em etapas.

* Structure

![Template_Method](https://user-images.githubusercontent.com/31738300/93824201-6cfbd400-fc39-11ea-8a48-2f1d0a692219.png)
  
* Participants:
  - FrameworkClass:
    - Define o Template Method que é responsável por chamar os demais métodos.
    - Especifica os métodos abstratos das etapas de execução.
  - ApplicationClassOne / ApplicationClassTwo:
    - Redefine, quando necessário, algumas etapas do algoritmo especificado em FrameworkClass
    
 - Sample Code:
    - [Código](https://github.com/aleboer/PadroesDeProjeto/tree/master/TemplateMethod/src)
    
    Simulador de video player para no código acima para exemplificar a implementação do Template Method.
