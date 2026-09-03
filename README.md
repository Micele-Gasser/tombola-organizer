# Tombola Organizer
Tool to organize a tombola for local events. The Tool is not ment as a webshop, but rather for showcasting the boughed tickets and prices to the crowd. It includes calculating country specific regulations, creating tickets, linking tickets to prices, and showcasting buyed tickets and prices on an extra TV.

## Tool Requirements
- Additional TV for showcasting (Optional, but sad without)
- Java

## How does the tool work?

### Buying tickets
The tool is not built as a webshop! The cashier first needs to check the payment of the customer. If he approves, the ticket will be created and a display animation is shown on the TV.

```mermaid
---
config:
  theme: redux-color
  look: classic
---
sequenceDiagram
    participant Customer
    participant Cashier
    participant Application
    participant Presentation

    Customer->>Cashier: Buys X tickets
    Cashier->>Application: Creates order (Admin Tool)
    Application->>Application:Processes request
    Application->>Presentation: Triggers buying animation
    Presentation-->>Customer: Displays winning tickets
```

### Download
TODO: download exe
