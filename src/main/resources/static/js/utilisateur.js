$('document').ready(function(){
    // Pour afficher le formulaire de modification
    $('table #editUtilisateur').on('click', function(event){
        event.preventDefault();
        // /utilisateurs/findById/?id=...
        var href = $(this).attr('href');

        $.get(href, function(utilisateur, status){
           $('#idModifie').val(utilisateur.id);
           $('#nomModifie').val(utilisateur.nom);
           $('#prenomModifie').val(utilisateur.prenom);
           $('#pseudoModifie').val(utilisateur.pseudo);
           $('#emailModifie').val(utilisateur.email);
           $('#motDePasseModifie').val(utilisateur.motDePasse);
           $('#telephoneModifie').val(utilisateur.telephone);
           $('#statutModifie').val(utilisateur.statut);
        });
        $('#editModal').modal();
    });

    // Pour afficher les details de l'utilisateur
    $('table #detailsUtilisateur').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');

        $.get(href, function(utilisateur, status){
            $('#idDetails').val(utilisateur.id);
            $('#nomDetails').val(utilisateur.nom);
            $('#prenomDetails').val(utilisateur.prenom);
            $('#pseudoDetails').val(utilisateur.pseudo);
            $('#emailDetails').val(utilisateur.email);
            $('#motDePasseDetails').val(utilisateur.motDePasse);
            $('#telephoneDetails').val(utilisateur.telephone);
            $('#statutDetails').val(utilisateur.statut);
        });
        $('#detailsModal').modal();
    });

    // Pour afficher la console de suppression
    $('table #deleteUtilisateur').on('click', function(event){
       event.preventDefault();
       var href= $(this).attr('href');
       $('#confirmDeleteButton').attr('href', href);
       $('#deleteModal').modal();
    });
});