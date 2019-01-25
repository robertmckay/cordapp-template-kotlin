package com.template.contracts

import com.template.states.TemplateState
import net.corda.core.contracts.*
import net.corda.core.identity.AbstractParty
import net.corda.core.transactions.LedgerTransaction
import net.corda.finance.contracts.asset.OnLedgerAsset

// ************
// * Contract *
// ************
class TemplateContract : OnLedgerAsset<TemplateState, TemplateContract.Commands, FungibleAsset<TemplateState>>(), Contract {
    companion object {
        // Used to identify our contract when building a transaction.
        const val ID = "com.template.contracts.TemplateContract"
    }

    override fun deriveState(txState: TransactionState<FungibleAsset<TemplateState>>, amount: Amount<Issued<TemplateState>>, owner: AbstractParty): TransactionState<FungibleAsset<TemplateState>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun generateExitCommand(amount: Amount<Issued<TemplateState>>): CommandData {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun generateMoveCommand(): MoveCommand {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun extractCommands(commands: Collection<CommandWithParties<CommandData>>): Collection<CommandWithParties<Commands>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // A transaction is valid if the verify() function of the contract of all the transaction's input and output states
    // does not throw an exception.
    override fun verify(tx: LedgerTransaction) {
        // Verification logic goes here.
    }

    // Used to indicate the transaction's intent.
    interface Commands : CommandData {
        class Action : Commands
    }
}