/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUN WEI
 */

package GUI;
import Classes.People;
import Classes.Committee;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Update_People extends javax.swing.JFrame {

    /**
     * Creates new form Update_People
     */
    Committee committee = new Committee();
    People people = new People();
    
    public Update_People() {
        initComponents();
        ViewPeople();
    }
    
    
    public void ViewPeople(){
       String people[]; 
       List<String> peoplelist = new ArrayList<>(); 
       String line = ""; 
       DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
       tblModel.setRowCount(0);//Reset jTable, Clear all data
       
        peoplelist = committee.ViewPeople();
        for (String element : peoplelist) {
            people = element.split(",");
               
            tblModel.addRow(people);

            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelUpdateVaccineMenuBar = new javax.swing.JLabel();
        jLabelHomeMenuBar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelLogoutMenuBar = new javax.swing.JLabel();
        jLabelUpdateAppointmentMenuBar = new javax.swing.JLabel();
        jLabelUpdateCommitteeMenuBar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldaddPassword = new javax.swing.JTextField();
        jButtonClear = new javax.swing.JButton();
        jButtonaddPeople = new javax.swing.JButton();
        jButtonEditPeople = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButtonDeletePeople = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldIC = new javax.swing.JTextField();
        jTextFieldSearchInput = new javax.swing.JTextField();
        jRadioButtonCitizen = new javax.swing.JRadioButton();
        jRadioButtonNonCitizen = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldDOB = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jRadioButtonVaccinated = new javax.swing.JRadioButton();
        jRadioButtonUnvaccinated = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabelUpdateVaccineMenuBar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUpdateVaccineMenuBar.setText("Update Vaccine");
        jLabelUpdateVaccineMenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUpdateVaccineMenuBarMouseClicked(evt);
            }
        });

        jLabelHomeMenuBar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelHomeMenuBar.setText("Home");
        jLabelHomeMenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMenuBarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Update People");

        jLabelLogoutMenuBar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelLogoutMenuBar.setText("Logout");
        jLabelLogoutMenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoutMenuBarMouseClicked(evt);
            }
        });

        jLabelUpdateAppointmentMenuBar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUpdateAppointmentMenuBar.setText("Update Appointment");
        jLabelUpdateAppointmentMenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUpdateAppointmentMenuBarMouseClicked(evt);
            }
        });

        jLabelUpdateCommitteeMenuBar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUpdateCommitteeMenuBar.setText("Update Committee");
        jLabelUpdateCommitteeMenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUpdateCommitteeMenuBarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelHomeMenuBar)
                .addGap(87, 87, 87)
                .addComponent(jLabel3)
                .addGap(91, 91, 91)
                .addComponent(jLabelUpdateVaccineMenuBar)
                .addGap(106, 106, 106)
                .addComponent(jLabelUpdateAppointmentMenuBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUpdateCommitteeMenuBar)
                .addGap(78, 78, 78)
                .addComponent(jLabelLogoutMenuBar)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHomeMenuBar)
                    .addComponent(jLabel3)
                    .addComponent(jLabelUpdateVaccineMenuBar)
                    .addComponent(jLabelUpdateAppointmentMenuBar)
                    .addComponent(jLabelLogoutMenuBar)
                    .addComponent(jLabelUpdateCommitteeMenuBar))
                .addGap(55, 55, 55))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setText("Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setText("ID:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setText("Password");

        jTextFieldID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextFieldID.setToolTipText("");

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextFieldaddPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jButtonClear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonaddPeople.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonaddPeople.setText("Add");
        jButtonaddPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddPeopleActionPerformed(evt);
            }
        });

        jButtonEditPeople.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonEditPeople.setText("Edit");
        jButtonEditPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditPeopleActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NRIC/Passport", "Name", "Citizen/Non-Citizen", "DOB", "Vaccination Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel11.setText("Updating People");

        jButtonDeletePeople.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonDeletePeople.setText("Delete");
        jButtonDeletePeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletePeopleActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel12.setText("D.O.B(dd/mm/yy)");

        jTextFieldIC.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextFieldSearchInput.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextFieldSearchInput.setText("Search ID");
        jTextFieldSearchInput.setToolTipText("Enter an ID to search");
        jTextFieldSearchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchInputActionPerformed(evt);
            }
        });

        jRadioButtonCitizen.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jRadioButtonCitizen.setText("Citizen");
        jRadioButtonCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCitizenActionPerformed(evt);
            }
        });

        jRadioButtonNonCitizen.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jRadioButtonNonCitizen.setText("Non-Citizen");
        jRadioButtonNonCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNonCitizenActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel13.setText("Citizen/Non-Citizen:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel14.setText("NRIC/Passport:");

        jTextFieldDOB.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextFieldDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDOBActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel15.setText("Vaccinated/Unvaccinated:");

        jRadioButtonVaccinated.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jRadioButtonVaccinated.setText("Vaccinated");
        jRadioButtonVaccinated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVaccinatedActionPerformed(evt);
            }
        });

        jRadioButtonUnvaccinated.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jRadioButtonUnvaccinated.setText("Unvaccinated");
        jRadioButtonUnvaccinated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUnvaccinatedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIC)
                            .addComponent(jTextFieldID)
                            .addComponent(jTextFieldaddPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldName)
                            .addComponent(jTextFieldDOB)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonCitizen)
                                        .addGap(73, 73, 73)
                                        .addComponent(jRadioButtonNonCitizen))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonaddPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonClear)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEditPeople)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDeletePeople))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonVaccinated)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonUnvaccinated)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonNonCitizen)
                            .addComponent(jRadioButtonCitizen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonUnvaccinated)
                            .addComponent(jRadioButtonVaccinated))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldaddPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonClear)
                                .addComponent(jButtonEditPeople)
                                .addComponent(jButtonDeletePeople))
                            .addComponent(jButtonaddPeople, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelUpdateVaccineMenuBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUpdateVaccineMenuBarMouseClicked
        UpdateVaccine updatevac = new UpdateVaccine();
        updatevac.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelUpdateVaccineMenuBarMouseClicked

    private void jLabelHomeMenuBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMenuBarMouseClicked
        Personnel_Menu pm = new Personnel_Menu();
        pm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelHomeMenuBarMouseClicked

    private void jLabelLogoutMenuBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMenuBarMouseClicked
        int response = JOptionPane.showConfirmDialog(null, "Please Confitm to LOGOUT!", "Select Option", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION){
            committee.logout();
            dispose();
        }
    }//GEN-LAST:event_jLabelLogoutMenuBarMouseClicked

    private void jLabelUpdateAppointmentMenuBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUpdateAppointmentMenuBarMouseClicked
        UpdateAppointment updateapt = new UpdateAppointment();
        updateapt.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelUpdateAppointmentMenuBarMouseClicked

    private void jLabelUpdateCommitteeMenuBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUpdateCommitteeMenuBarMouseClicked
        Update_Committee updatecommit = new Update_Committee();
        updatecommit.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelUpdateCommitteeMenuBarMouseClicked

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Please Confitm to CLEAR!", "Select Option", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION){
            String clear = "";
            jTextFieldID.setText(clear);
            jTextFieldName.setText(clear);
            jTextFieldIC.setText(clear);
            jRadioButtonCitizen.setSelected(false);
            jRadioButtonNonCitizen.setSelected(false);
            jTextFieldDOB.setText(clear);
            jTextFieldaddPassword.setText(clear);
            jRadioButtonVaccinated.setSelected(false);
            jRadioButtonUnvaccinated.setSelected(false);
        }
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonaddPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddPeopleActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Please Confitm to ADD!", "Select Option", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION){
            People people = new People();


            String pvacstatus,ptype,clear,ID,name,IC,DOB,password;
            int id;

            pvacstatus = "";
            ptype = "";
            clear = "";
            ID = (jTextFieldID.getText()).trim();
            name = (jTextFieldName.getText()).trim();
            IC = (jTextFieldIC.getText()).trim();
            DOB = (jTextFieldDOB.getText().trim());
            if(jRadioButtonCitizen.isSelected()){
                ptype = "Citizen";
            }
            else if (jRadioButtonNonCitizen.isSelected()){
                ptype = "Non-Citizen";
            }
            else{
                ptype = "";
            }
                
            if(jRadioButtonVaccinated.isSelected()){
                pvacstatus = "Vacinated";
            }
            else if (jRadioButtonUnvaccinated.isSelected()){
                pvacstatus = "Unvaccinated";
            }
            else{
                pvacstatus = "";
            }

            password = jTextFieldaddPassword.getText();

            if(ID.length()==0 || name.length()==0 || IC.length()==0 || ptype.length()==0 || DOB.length()==0 || password.length()==0 || pvacstatus.length()==0){
                JOptionPane.showMessageDialog(null,"Form Incomplete!");
            }else if(committee.checkDuplicatePeople(ID, IC)==true){
                JOptionPane.showMessageDialog(null,"ID/People already exist! Please try again!");
            }else{
                id = Integer.parseInt(ID);
                people.setID(id);
                people.setIC(IC);
                people.setName(name);
                people.setPtype(ptype);
                people.setDOB(DOB);
                people.setStatus(pvacstatus);
                people.setPassword(password);
                JOptionPane.showMessageDialog(null,committee.addPeople(people.getID(),people.getIC(),people.getName(),people.getPtype(),people.getDOB(),people.getStatus(),people.getPassword()));

            }
            ViewPeople();
            jTextFieldID.setText(clear);
            jTextFieldName.setText(clear);
            jTextFieldIC.setText(clear);
            jRadioButtonCitizen.setSelected(false);
            jRadioButtonNonCitizen.setSelected(false);
            jTextFieldDOB.setText(clear);
            jTextFieldaddPassword.setText(clear);
            jRadioButtonVaccinated.setSelected(false);
            jRadioButtonUnvaccinated.setSelected(false);
        }
    }//GEN-LAST:event_jButtonaddPeopleActionPerformed

    private void jButtonEditPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditPeopleActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Please Confitm to EDIT!", "Select Option", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION){
            String pID,ptype,pIC,pname,pDOB,pvacstatus;
            int id;
            ptype = "";
            pvacstatus = "";
            pID = (jTextFieldID.getText()).trim();
            pIC = jTextFieldIC.getText();
            pname = jTextFieldName.getText();
            pDOB = jTextFieldDOB.getText();
            if(jRadioButtonCitizen.isSelected()){
                ptype = "Citizen";
            }
            else if (jRadioButtonNonCitizen.isSelected()){
                ptype = "Non-Citizen";
            }
            else{
                ptype = "";
            }
                
            if(jRadioButtonVaccinated.isSelected()){
                pvacstatus = "Vacinated";
            }
            else if (jRadioButtonUnvaccinated.isSelected()){
                pvacstatus = "Unvaccinated";
            }
            else{
                pvacstatus = "";
            }
            String ppassword = jTextFieldaddPassword.getText();
            
            id = Integer.parseInt(pID);
            people.setID(id);
            people.setIC(pIC);
            people.setName(pname);
            people.setDOB(pDOB);
            people.setPtype(ptype);
            people.setPassword(ppassword);
            people.setStatus(pvacstatus);

            int checkID = Integer.valueOf(pID);

            if(pID.length()==0 || pname.length()==0 || pIC.length()==0 || ptype.length()==0 || pDOB.length()==0 || ppassword.length()==0 || pvacstatus.length()==0){
                JOptionPane.showMessageDialog(null,"Form incomplete!");
            }else if(committee.checkDuplicatePeople(pIC)==true){
                JOptionPane.showMessageDialog(null,"People already exist! Please try again!");
            }else{
                JOptionPane.showMessageDialog(null,committee.editPeople(people.getID(),people.getIC(),people.getName(), people.getPtype(), people.getDOB(), people.getStatus(),people.getPassword()));
            }
            ViewPeople();
        }
    }//GEN-LAST:event_jButtonEditPeopleActionPerformed

    private void jButtonDeletePeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletePeopleActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Please Confitm to DELETE!", "Select Option", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION){
            int id;
            ArrayList<String> peoplelist = new ArrayList<String>();
            peoplelist.clear();
            List<String> searchlist = new ArrayList<>();
            String ID;
            ID = (jTextFieldID.getText()).trim();
   
            if(ID.isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter an ID to delete!");
            }
            else{
                id = Integer.parseInt(ID);
                people.setID(id);
                JOptionPane.showMessageDialog(null,committee.deletePeople(people.getID()));
            }
            ViewPeople();
        }
    }//GEN-LAST:event_jButtonDeletePeopleActionPerformed

    private void jTextFieldSearchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchInputActionPerformed
        ArrayList<String> peoplelist = new ArrayList<String>();
        int checkid;
        peoplelist.clear();
        List<String> searchlist = new ArrayList<>();
        String searchID[];
        String line,ID;
        ID = (jTextFieldSearchInput.getText()).trim();
        
        if(ID.isEmpty()){
            JOptionPane.showMessageDialog(null,"Enter an ID to delete!");
            ViewPeople();
        }
        else{
            checkid = Integer.parseInt(ID);
            searchlist = committee.searchPeople(checkid);
            for (String element : searchlist) {
                searchID = element.split(",");

                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.setRowCount(0);
                tblModel.addRow(searchID);
            }
        }

    }//GEN-LAST:event_jTextFieldSearchInputActionPerformed

    private void jRadioButtonCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCitizenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCitizenActionPerformed

    private void jRadioButtonNonCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNonCitizenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNonCitizenActionPerformed

    private void jTextFieldDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDOBActionPerformed

    private void jRadioButtonVaccinatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVaccinatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonVaccinatedActionPerformed

    private void jRadioButtonUnvaccinatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUnvaccinatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonUnvaccinatedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update_People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_People().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDeletePeople;
    private javax.swing.JButton jButtonEditPeople;
    private javax.swing.JButton jButtonaddPeople;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelHomeMenuBar;
    private javax.swing.JLabel jLabelLogoutMenuBar;
    private javax.swing.JLabel jLabelUpdateAppointmentMenuBar;
    private javax.swing.JLabel jLabelUpdateCommitteeMenuBar;
    private javax.swing.JLabel jLabelUpdateVaccineMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonCitizen;
    private javax.swing.JRadioButton jRadioButtonNonCitizen;
    private javax.swing.JRadioButton jRadioButtonUnvaccinated;
    private javax.swing.JRadioButton jRadioButtonVaccinated;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDOB;
    private javax.swing.JTextField jTextFieldIC;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSearchInput;
    private javax.swing.JTextField jTextFieldaddPassword;
    // End of variables declaration//GEN-END:variables
}