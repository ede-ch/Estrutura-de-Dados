package TAD6_2;

public class LDE {

    private No head;
    private No tail;

    public LDE() {
        this.head = null;
        this.tail = null;
    }

    public void inserirInicio(Object data) {
        No novoNo = new No(data);

        if (head == null) {
            head = novoNo;
            tail = novoNo;
        } else {
            novoNo.next = head;
            head.prev = novoNo;
            head = novoNo;
        }
    }

    public void inserirFim(Object data) {
        No novoNo = new No(data);

        if (tail == null) {
            head = novoNo;
            tail = novoNo;
        } else {
            novoNo.prev = tail;
            tail.next = novoNo;
            tail = novoNo;
        }
    }

    public void imprimir() {
        System.out.println("Impressão da frente para trás:");
        No currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

        System.out.println("Impressão de trás para frente:");
        currentNode = tail;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.prev;
        }
    }

    public boolean buscar(Object data) {
        No currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void remover(Object data) {
        No currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                if (currentNode == head) {
                    head = currentNode.next;
                    head.prev = null;
                } else if (currentNode == tail) {
                    tail = currentNode.prev;
                    tail.next = null;
                } else {
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                }
            }
            currentNode = currentNode.next;
        }
    }
    
    public void removerInicio() {
        if (head == null) {
            return;
        }
        
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        
        head = head.next;
        head.prev = null;
    }

    public void removerFim() {
        if (tail == null) {
            return;
        }
        
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        
        tail = tail.prev;
        tail.next = null;
    }

    public void removerTodos(Object data) {
        No currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                if (currentNode == head) {
                    head = currentNode.next;
                    head.prev = null;
                } else if (currentNode == tail) {
                    tail = currentNode.prev;
                    tail.next = null;
                } else {
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                }
            }
            currentNode = currentNode.next;
        }
    }


}
    

