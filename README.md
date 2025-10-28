# Плагин для предупреждения о полиномиальной сложности (и выше) алгоритма
## Описание:
### Автоматическое обнаружение вложенных циклов, предупреждения в редакторе кода, поддержка всех типов циклов (for, while), анализ сложности алгоритмов.
## Установка:
### 1. Скачайте последнюю версию с гитхаба и соберите
```
git clone https://github.com/void337/plugin.git
cd plugin
./gradlew buildPlugin
```
### 2. File → Settings → Plugins
### 3. Нажмите settings → Install Plugin from Disk...
### 4. Выберите собранный zip file из build/distributions
### 5. Перезапустите IDEA

## Основной класс: `SimpleComplexityChecker`
```java
public class SimpleComplexityChecker extends AbstractBaseJavaLocalInspectionTool {}
```
Предназначен для автоматического анализа Java кода и обнаружения вложенных циклов, которые могут указывать на алгоритмическую сложность O(n²) или выше.
## Методы класса

### 1. `buildVisitor()` - Основной метод построения посетителя

#### Описание:
Создает и возвращает объект `PsiElementVisitor`, который обходит Abstract Syntax Tree (AST) Java кода и вызывает методы обработки для различных элементов.
#### Возвращаемое значение:
`@NotNull PsiElementVisitor`

### 2. `checkForNestedLoops()` - Метод проверки вложенных циклов

#### Описание:
Рекурсивно анализирует тело внешнего цикла на наличие вложенных циклов. При обнаружении вложенного цикла регистрирует предупреждение.
Метод не возвращает значение.
## Класс для теста: `test`
Нвходится в `src\test\java\test.java`

## Коммиты
commit 86bd5eacdfdc3350018bc153229752d15e48a22c (HEAD -> master, origin/master)
Author: Chris <technology16006@mail.ru>
Date:   Tue Oct 28 00:01:09 2025 +0300

    Plugin


