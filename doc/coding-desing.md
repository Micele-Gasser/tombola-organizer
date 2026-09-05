# Code Desing
This read-me shows architecture and design of Tombola Organizer.

## Overview
This short overview explains the concept Tombola Organzier. The relations of different topics is shown.
```Mermaid
---
config:
  theme: neo-dark
---
flowchart TB
    Tombola["Tombola"] -- has --> Tickets["Tickets"] & SaveFile["SaveFile"] & Regulations["Regulations"] & Prices["Prices"] & Display["Display"]
    Customer["Customer"] -- creates --> Order["Order"]
    Order -- has --> Tickets
    Order -- animated on (disappear after animation) --> Display
    Tickets -- have chances of --> Prices
    Prices -- showed on --> Display
    Prices -- play into --> Regulations
    Regulations -- set number of --> Tickets
```

## Domain Model
The domain model is usefull for programmers to understand classes and their functionality. 
```Mermaid
---
config:
  theme: neo-dark
  class:
    hideEmptyMembersBox: true
  layout: dagre
---
classDiagram
direction TB
    class TombolaController {
    }

    class ServiceManager {
	    saveFileLocation
	    settingsFileLocation
      settings
    }

    class SetupController {
    }

    class RegulationsManager {
	    countryRegulationWinningChance
	    countryRegulationInvestToWinningRatio
    }

    class PricesList {
	    numberOfPrices
    }

    class Price {
	    priceTitle
	    priceDescription
	    priceCost
	    pricePhoto
    }

    class TicketList {
    }

    class Ticket{
        ticketNumber    
    }

    class OrderList{
    }

    class Order{
      ticketNumber [Array]
      customer
    }

    class TombolaEventBus{
    }

    class DisplayController{
        orderAnimation
        pricelist
    }

    TombolaController "1" --> "1" SetupController : sets up Tombola with
    TombolaController "1" --> "1" ServiceManager : saves File and Settings
    SetupController "1" --> "1" RegulationsManager : checks country regulations
    SetupController "1" --> "1" PricesList
    SetupController "1" --> "1" TicketList
    TicketList "1" --> "*" Ticket
    PricesList "1" --> "*" Price
    SetupController "1" --> "1" TombolaEventBus : starts Tombola
    TombolaEventBus "1" --> "1" OrderList : adds order
    OrderList "1" --> "*" Order
    TombolaEventBus --> TombolaController : saves order to disk
    TombolaEventBus --> DisplayController : Trigger listener
```

## Design
Todo
