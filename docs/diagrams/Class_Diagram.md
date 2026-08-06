# Class Diagram

## Core Classes (Backend)

```
┌─────────────────────┐
│    VisitorController│
├─────────────────────┤
│+ registerVisitor()  │
│+ getVisitor()       │
│+ listVisitors()     │
└──────────┬──────────┘
           │ uses
           ▼
┌─────────────────────┐
│   VisitorService    │
├─────────────────────┤
│+ registerVisitor()  │
│+ getVisitor()       │
│+ listVisitors()     │
└──────────┬──────────┘
           │ uses
           ▼
┌─────────────────────┐
│ VisitorRepository   │
├─────────────────────┤
│+ save()             │
│+ findById()         │
│+ findAll()          │
│+ delete()           │
└─────────────────────┘

┌─────────────────────┐
│   GatePassService   │
├─────────────────────┤
│+ approvePass()      │
│+ rejectPass()       │
│+ listPendingPasses()│
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│GatePassRepository   │
├─────────────────────┤
│+ save()             │
│+ findById()         │
│+ findAll()          │
└─────────────────────┘

┌─────────────────────┐
│    EntryLogService  │
├─────────────────────┤
│+ checkIn()          │
│+ checkOut()         │
│+ getInsideVisitors()│
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ EntryLogRepository  │
├─────────────────────┤
│+ save()             │
│+ findAll()          │
└─────────────────────┘
```

**Architecture Pattern:** Controller (REST endpoints) → Service (business logic) → Repository (database access)

**Key Relationships:**
- Controller delegates to Service
- Service delegates to Repository
- Each service handles one domain (Visitor, GatePass, EntryLog)
